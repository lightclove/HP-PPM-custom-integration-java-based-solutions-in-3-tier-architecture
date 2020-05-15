#!/bin/env bash
cd /PPM-pump/ppmclient
/PPM-pump/ppmclient/start_pump.sh sync
MY_PROMPT='$ '
counter=0
error=0
hour=`date +%H`
let h1=$hour-1
let h2=$hour+1

d=`date +%Y-%m-%d`
#регулярное выражения для идентификации ошибок в течении 3 часов. Нужно для перезапуска программы
error=`grep -c -E "^ERROR \| $d ($hour|0$h1|0$h2).*$" /PPM-pump/ppmclient/log/PPMPump.log| awk 'BEGIN { RS = ":" } { print $1 }'` 
#записываем сколько ошибок нашли после первого запуска
echo  "$d : How many error: $error" >>log.log
echo $error

while ((counter<3 && error>0))
do
	/PPM-pump/ppmclient/start_pump.sh sync

	error=`grep -c -E "^ERROR \| $d ($hour|0$h1|0$h2).*$" /PPM-pump/ppmclient/log/PPMPump.log| awk 'BEGIN { RS = ":" } { print $1 }'`;
	#записываем сколько ошибок нашли после очередного запуска
	echo "$d : How many error: $error">>log.log
 
	if ((error>0))
	then
		let counter=counter+1; 
		#записываем какая по счёту попытка синхронизироваться прошла
		echo "$d : continue with counter: $counter">>log.log;
		continue;
	else
		echo "break";
		break;
	fi

done


echo "$d : ending sync\n">>log.log;
