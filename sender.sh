#!/bin/sh
LIMIT=35000
#var0=33000
var0=34742


while [ "$var0" -lt "$LIMIT" ]
do
	sh /PPM-pump/ppmmailsender/start_mailsender.sh  send $var0 2
	var0=`expr $var0 + 1`
done

echo "Ending"