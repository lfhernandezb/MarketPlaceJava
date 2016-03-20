DIR=`dirname $0`

cd $DIR

echo "borrando base de datos..."
/usr/bin/mysql -u root -pbl52b3rd --execute="drop database marketplace;"
echo "creando base de datos..."
/usr/bin/mysql -u root -pbl52b3rd --execute="create database marketplace;"
echo "creando objetos en la base de datos..."
/usr/bin/mysql -u root -pbl52b3rd --default-character-set=latin1 marketplace < create.sql
echo "creando usuarios..."
/usr/bin/mysql -u root -pbl52b3rd --default-character-set=latin1 < users.sql
echo "datos geograficos"
/usr/bin/mysql -u mktp -pmktp --default-character-set=latin1 marketplace < ../data/geografico.sql
echo "tipo_vehiculo"
/usr/bin/mysql -u mktp -pmktp --default-character-set=latin1 marketplace < ../data/tipo_vehiculo.sql
echo "marca"
/usr/bin/mysql -u mktp -pmktp --default-character-set=latin1 marketplace < ../data/marca.sql
echo "modelo"
/usr/bin/mysql -u mktp -pmktp --default-character-set=latin1 marketplace < ../data/modelo.sql

#/usr/bin/mysql -u mktp -pmktp mktp < ../data/red_social.sql
/usr/bin/mysql -u mktp -pmktp marketplace < ../data/combustible.sql
/usr/bin/mysql -u mktp -pmktp marketplace < ../data/traccion.sql
/usr/bin/mysql -u mktp -pmktp marketplace < ../data/tipo_transmision.sql
#echo "usuario"
#/usr/bin/mysql -u mktp -pmktp mktp < ../data/usuario.sql
#echo "autenticacion"
#/usr/bin/mysql -u mktp -pmktp mktp < ../data/autenticacion.sql
#echo "vehiculo"
#/usr/bin/mysql -u mktp -pmktp mktp < ../data/vehiculo.sql
#echo "mantencion_usuario"
#/usr/bin/mysql -u mktp -pmktp mktp < ../data/mantencion_usuario.sql
#echo "mantencion_base"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < ../data/mantencion_base.sql
#echo "cambio_revision"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < ../data/cambio_revision.sql
#echo "proveedor"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < ../data/proveedor.sql
#echo "proveedor_mantencion_base"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < ../data/proveedor_mantencion_base.sql
#echo "mantencion_usuario_hecha"
#/usr/bin/mysql -u mktp -pmktp mktp < ../data/mantencion_usuario_hecha.sql
#echo "recordatorio"
#/usr/bin/mysql -u mktp -pmktp mktp < ../data/recordatorio.sql
#echo "mktpga_combustible"
#/usr/bin/mysql -u mktp -pmktp mktp < ../data/carga_combustible.sql
#echo "reparacion"
#/usr/bin/mysql -u mktp -pmktp mktp < ../data/reparacion.sql
#echo "cia_seguros"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < ../data/cia_seguros.sql
#echo "parametro"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < ../data/parametro.sql
#echo "usuario_web"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < ../data/usuario_web.sql
#echo "triggers"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < triggers.sql
#echo "triggers suplementarios"
#/usr/bin/mysql -u marketplace -pmarketplace --default-character-set=latin1 marketplace < triggers_suppl.sql
#
# respaldos utiles para generar la bd sqlite
#
#/usr/bin/mysqldump --opt --skip-extended-insert -u marketplace -pmarketplace --default-character-set=latin1 marketplace tipo_vehiculo | grep -E "^INSERT" > ../../mobile/bd/tipo_vehiculo.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u marketplace -pmarketplace --default-character-set=latin1 marketplace marca | grep -E "^INSERT" > ../../mobile/bd/marca.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u marketplace -pmarketplace --default-character-set=latin1 marketplace modelo | grep -E "^INSERT" > ../../mobile/bd/modelo.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u marketplace -pmarketplace --default-character-set=latin1 marketplace mantencion_base | grep -E "^INSERT" > ../../mobile/bd/mantencion_base.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u marketplace -pmarketplace --default-character-set=latin1 marketplace cambio_revision | grep -E "^INSERT" > ../../mobile/bd/cambio_revision.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u marketplace -pmarketplace --default-character-set=latin1 marketplace cambio_revision | grep -E "^INSERT" > ../../mobile/bd/cambio_revision.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u marketplace -pmarketplace --default-character-set=latin1 marketplace cia_seguros | grep -E "^INSERT" > ../../mobile/bd/cia_seguros.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u marketplace -pmarketplace --default-character-set=latin1 marketplace parametro | grep -E "^INSERT" > ../../mobile/bd/parametro.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u mktp -pmktp mktp perfil_uso | grep -E "^INSERT" > ../../mobile/bd/perfil_uso.sql
#/usr/bin/mysqldump --opt --skip-extended-insert -u mktp -pmktp mktp tipo_seguro | grep -E "^INSERT" > ../../mobile/bd/tipo_seguro.sql

