    CREATE TABLE IF NOT EXISTS  paciente (
      id serial,
      nombre VARCHAR(45) NOT NULL,
      sintoma VARCHAR(45) NULL,
      PRIMARY KEY (id)
      );