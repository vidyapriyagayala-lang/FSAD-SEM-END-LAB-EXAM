# Payment HQL Maven Hibernate Project

## Database
Create MySQL database:

```sql
CREATE DATABASE fsadendexam;
```

## Update Credentials
Edit `src/main/resources/hibernate.cfg.xml` with your MySQL username/password.

## Run
```bash
mvn clean install
```

Then run `ClientDemo.java`.

## Features
- Insert Payment record using persistent object
- Delete Payment record using HQL with named parameter
