#!/bin/env bash

#Declaretion variables
dir=`pwd`

HOME="/PPM-pump/ppmclient"
J_HOME="/opt/java6/bin"
cd $HOME
#echo "change home dir $HOME" >> $HOME/log.log
groupfile="group.csv"
userfile="user.csv"
params="-Dlog4j.configuration=$HOME/conf/log4j.properties -Djavax.net.ssl.trustStore=$HOME/jssecacerts -Dsun.net.client.defaultConnectTimeout=300000 -Dsun.net.client.defaultReadTimeout=500000"
METRO="$HOME/PPM-client_lib"
CPATH=.:$METRO/webservices-rt.jar:$METRO/webservices-api.jar:$METRO/MegaWCF.jar:$METRO/commons-logging-1.1.1.jar:$METRO/ojdbc6.jar:$METRO/org.springframework.transaction-3.0.5.RELEASE.jar:$METRO/org.springframework.core-3.0.5.RELEASE.jar:$METRO/org.springframework.jdbc-3.0.5.RELEASE.jar:$METRO/activation.jar:$METRO/org.springframework.context-3.0.5.RELEASE.jar:$METRO/org.springframework.context.support-3.0.5.RELEASE:$METRO/mail.jar:$METRO/dsn.jar:$METRO/imap.jar:$METRO/mailapi.jar:$METRO/pop3.jar:$METRO/smtp.jar


if [ -n $1 ]
then
        t=$1
else 
	t="legend"
fi

if [ "$1" = "test" ]
    then
    if [ -n $2 ]
        then
             email=$2
    fi
fi


########################################
synchronize()
{
echo "Running Full sync" ;
$J_HOME/java -classpath $CPATH $params -jar $HOME/PPM-client.jar $1 $2 $3 ;
return ;
}


testing()
{
echo "Running test sync whith email $7" ; 
$J_HOME/java -classpath $1 $2 -jar PPM-client.jar $4 $5 $6 $7 ;
return ;
}

legend()
{
echo "
startMS.sh <target> [<user_output_file> <group_file>] [<email>]
target
sync - run application for fuill synchromnze;
example:
sh startMS.sh sync
testsingle - run single sync;
example:
sh startMS.sh test <any_email>
" > ./log.log
return ;
}
#######################################


case $1 in
'sync') 
	synchronize $1 $userfile $groupfile
	;;
'test')
	
	testing $CPATH $params $1 $userfile $groupfile $2
	;;
*)  
	legend 
	;;
esac

cd $pwd;
