#!/bin/env bash
#cd  /export/oracle/product/11.1.0/client_1/bin/
/export/oracle/product/11.1.0/client_1/bin/sqlplus ppmadm/ppmadm@ppm @/export/PPM/scripts/krsc_org_unit_interface_1.sql "/export/PPMshare_new/reports/" "34488" "" "Y" "Y" "Y" "rep_`date +%Y%m%d`" "1" "admin" "" "APPEND_MOVE" "N" "Y" >> /PPM-pump/ppmclient/log.log
/export/oracle/product/11.1.0/client_1/bin/sqlplus ppmadm/ppmadm@ppm @/export/PPM/scripts/krsc_org_unit_interface_2.sql  "/export/PPMshare_new/reports/" "34488" "" "Y" "Y" "Y" "rep_`date +%Y%m%d`" "1" "admin" "" "APPEND_MOVE" "N" "Y" "100001" >> /PPM-pump/ppmclient/log.log

