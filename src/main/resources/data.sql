INSERT INTO CLIENTE (nome,email,telefone) VALUES ('Rodrigo Siqueira','rodcruzeiro@yahoo.com.br','31991191366');

INSERT INTO CATEGORIA (nome) VALUES ('Porco');
INSERT INTO CATEGORIA (nome) VALUES ('Frango');

INSERT INTO LINGUICA (nome,data_Fabricacao,status,cliente_id,categoria_id) VALUES (
'Porco tradicional',CURDATE(),'AGUARDANDO_PEDIDO','1','1');
INSERT INTO LINGUICA (nome,data_Fabricacao,status,cliente_id,categoria_id) VALUES (
'Porco apimentada',CURDATE(),'AGUARDANDO_PEDIDO','1','1');
INSERT INTO LINGUICA (nome,data_Fabricacao,status,cliente_id,categoria_id) VALUES (
'Frango com queijo',CURDATE(),'AGUARDANDO_PEDIDO','1','2');


