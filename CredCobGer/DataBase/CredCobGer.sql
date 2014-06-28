
CREATE TABLE ahorro (
  COD_AHO varchar(11) NOT NULL default '',
  CODIGO_AS varchar(7) NOT NULL default '',
  SAL_AHO decimal(10,2) NOT NULL default '0.00',
  FEC_ULT_MOV_AHO date NOT NULL default '0000-00-00',
  FEC_APE_AHO date NOT NULL default '0000-00-00',
  PRIMARY KEY  (COD_AHO,CODIGO_AS)
) TYPE=InnoDB; 

CREATE TABLE aportacion (
  CODIGO_AS varchar(7) NOT NULL default '',
  CODIGO_APO varchar(11) NOT NULL default '',
  SALDO_APO decimal(10,2) NOT NULL default '0.00',
  FEC_APE_APO date NOT NULL default '0000-00-00',
  ULT_PAG_APO date NOT NULL default '0000-00-00',
  PRIMARY KEY  (CODIGO_APO,CODIGO_AS)
) TYPE=InnoDB; 

CREATE TABLE asociado (
  CODIGO_AS varchar(7) NOT NULL default '',
  NOMBRE_AS varchar(30) NOT NULL default '',
  APELLIDO_AS varchar(30) NOT NULL default '',
  DUI_AS varchar(10) NOT NULL default '',
  NIT_AS varchar(17) NOT NULL default '',
  EMAIL_AS varchar(40) default NULL,
  FECHA_NAC_AS date NOT NULL default '0000-00-00',
  FECHA_ING_AS date NOT NULL default '0000-00-00',
  DIRECTIVO_AS char(1) NOT NULL default '',
  EMPLEADO_AS char(1) NOT NULL default '',
  ACTUALIZADO_AS date NOT NULL default '0000-00-00',
  EDAD_MORA_PROM int(11) default NULL,
  APORT_VS_DEUDA decimal(10,2) default NULL,
  PAGO_PRE_FIN decimal(10,2) default NULL,
  RAZ_ENDEU decimal(10,2) default NULL,
  PRIMARY KEY  (CODIGO_AS)
) TYPE=InnoDB; 

CREATE TABLE bitacora_usu (
  COR_BIT_USU int(11) NOT NULL default '0',
  NOM_USU varchar(16) NOT NULL default '',
  FEC_BIT_USU date NOT NULL default '0000-00-00',
  EVE_BIT_USU varchar(30) NOT NULL default '',
  PRIMARY KEY  (COR_BIT_USU)
) TYPE=InnoDB; 

CREATE TABLE credito (
  COD_CRE varchar(11) NOT NULL default '',
  CODIGO_AS varchar(7) NOT NULL default '',
  NUM_LIN_CRED int(11) NOT NULL default '0',
  SUC_CRE varchar(10) default NULL,
  NIV_AUT_CRE varchar(10) default NULL,
  CLA_ACT_CRE char(2) NOT NULL default '',
  MON_BRU_CRE decimal(10,2) NOT NULL default '0.00',
  OTO_NET_CRE decimal(10,2) NOT NULL default '0.00',
  ABO_CRE decimal(10,2) NOT NULL default '0.00',
  ULT_FEC_PAG_CRE date NOT NULL default '0000-00-00',
  PAG_INT_CRE decimal(10,2) NOT NULL default '0.00',
  PAG_SEG_CRE decimal(10,2) NOT NULL default '0.00',
  PAG_MAN_CRE decimal(10,2) NOT NULL default '0.00',
  PAG_OTROS_CRE decimal(10,2) NOT NULL default '0.00',
  FEC_ACT_CRE date NOT NULL default '0000-00-00',
  PRIMARY KEY  (COD_CRE,CODIGO_AS)
) TYPE=InnoDB; 

CREATE TABLE deposito_plazo (
  CODIGO_AS varchar(7) NOT NULL default '',
  CODIGO_DEP varchar(11) NOT NULL default '',
  MONTO_DEP decimal(10,2) NOT NULL default '0.00',
  SALDO_DEP decimal(10,2) NOT NULL default '0.00',
  APERT_DEP date NOT NULL default '0000-00-00',
  VENC_DEP date NOT NULL default '0000-00-00',
  ULT_PAGO_DEP date NOT NULL default '0000-00-00',
  PRIMARY KEY  (CODIGO_DEP,CODIGO_AS)
) TYPE=InnoDB; 

CREATE TABLE direccion (
  CODIGO_AS varchar(7) NOT NULL default '',
  NUM_COR_DIR int(11) NOT NULL default '0',
  DIRE_DIR varchar(50) NOT NULL default '',
  PRIMARY KEY  (CODIGO_AS,NUM_COR_DIR)
) TYPE=InnoDB; 

CREATE TABLE linea_credito (
  NUM_LIN_CRED int(11) NOT NULL default '0',
  NOM_LIN_CRED varchar(20) NOT NULL default '',
  PRIMARY KEY  (NUM_LIN_CRED)
) TYPE=InnoDB; 

CREATE TABLE otorga (
  NUM_LIN_CRED int(11) NOT NULL default '0',
  NUM_CORR_SUC int(11) NOT NULL default '0',
  PRIMARY KEY  (NUM_LIN_CRED,NUM_CORR_SUC)
) TYPE=InnoDB; 

CREATE TABLE proy_anual (
  ANHO int(11) NOT NULL default '0',
  CODIGO_RUBRO char(2) NOT NULL default '',
  REALIZADO decimal(10,2) NOT NULL default '0.00',
  META decimal(10,2) NOT NULL default '0.00',
  PRIMARY KEY  (ANHO,CODIGO_RUBRO)
) TYPE=InnoDB; 

CREATE TABLE proy_mens (
  MES_PM int(11) NOT NULL default '0',
  CODIGO_RUBRO char(2) NOT NULL default '',
  ANHO_PM int(11) NOT NULL default '0',
  REALIZADO_PM decimal(10,2) NOT NULL default '0.00',
  META_PM decimal(10,2) NOT NULL default '0.00',
  PRIMARY KEY  (MES_PM,CODIGO_RUBRO)
) TYPE=InnoDB; 

CREATE TABLE rubro_proyeccion (
  CODIGO_RUBRO char(2) NOT NULL default '',
  NOMBRE varchar(20) NOT NULL default '',
  PRIMARY KEY  (CODIGO_RUBRO)
) TYPE=InnoDB;
 
CREATE TABLE sucursal (
  NUM_CORR_SUC int(11) NOT NULL default '0',
  NOMBRE_SUC varchar(20) NOT NULL default '',
  PRIMARY KEY  (NUM_CORR_SUC)
) TYPE=InnoDB; 

CREATE TABLE telefono (
  CODIGO_AS varchar(7) NOT NULL default '',
  NUM_COR int(11) NOT NULL default '0',
  NUM_TEL varchar(8) NOT NULL default '',
  PRIMARY KEY  (CODIGO_AS,NUM_COR)
) TYPE=InnoDB; 

CREATE TABLE tipo_usuario (
  COD_USU int(11) NOT NULL default '0',
  TIP_USU varchar(10) NOT NULL default '',
  PRIMARY KEY  (COD_USU)
) TYPE=InnoDB; 

CREATE TABLE usuario (
  NOM_USU varchar(16) NOT NULL default '',
  COD_USU int(11) NOT NULL default '0',
  CODIGO_AS varchar(7) NOT NULL default '',
  PAS_USU varchar(16) NOT NULL default '',
  ULT_ACC_USU date NOT NULL default '0000-00-00',
  PRIMARY KEY  (NOM_USU)
) TYPE=InnoDB; 


alter table AHORRO add constraint FK_AHORRA_EN foreign key (CODIGO_AS)
      references ASOCIADO (CODIGO_AS) on delete restrict on update restrict;

alter table APORTACION add constraint FK_PAGA_POR foreign key (CODIGO_AS)
      references ASOCIADO (CODIGO_AS) on delete restrict on update restrict;

alter table BITACORA_USU add constraint FK_REALIZA foreign key (NOM_USU)
      references USUARIO (NOM_USU) on delete restrict on update restrict;

alter table CREDITO add constraint FK_CLASIFICA foreign key (NUM_LIN_CRED)
      references LINEA_CREDITO (NUM_LIN_CRED) on delete restrict on update restrict;

alter table CREDITO add constraint FK_PUEDE_TENER_2 foreign key (CODIGO_AS)
      references ASOCIADO (CODIGO_AS) on delete restrict on update restrict;

alter table DEPOSITO_PLAZO add constraint FK_PUEDE_TENER foreign key (CODIGO_AS)
      references ASOCIADO (CODIGO_AS) on delete restrict on update restrict;

alter table DIRECCION add constraint FK_VIVE_EN foreign key (CODIGO_AS)
      references ASOCIADO (CODIGO_AS) on delete restrict on update restrict;

alter table OTORGA add constraint FK_OTORGA foreign key (NUM_LIN_CRED)
      references LINEA_CREDITO (NUM_LIN_CRED) on delete restrict on update restrict;

alter table OTORGA add constraint FK_OTORGA2 foreign key (NUM_CORR_SUC)
      references SUCURSAL (NUM_CORR_SUC) on delete restrict on update restrict;

alter table PROY_ANUAL add constraint FK_SE_CONTROLA foreign key (CODIGO_RUBRO)
      references RUBRO_PROYECCION (CODIGO_RUBRO) on delete restrict on update restrict;

alter table PROY_MENS add constraint FK_SE_CONTROLA_2 foreign key (CODIGO_RUBRO)
      references RUBRO_PROYECCION (CODIGO_RUBRO) on delete restrict on update restrict;

alter table TELEFONO add constraint FK_TIENE foreign key (CODIGO_AS)
      references ASOCIADO (CODIGO_AS) on delete restrict on update restrict;

alter table USUARIO add constraint FK_ES_UN foreign key (CODIGO_AS)
      references ASOCIADO (CODIGO_AS) on delete restrict on update restrict;

alter table USUARIO add constraint FK_SE_CLASIFICA foreign key (COD_USU)
      references TIPO_USUARIO (COD_USU) on delete restrict on update restrict;