Entity represents data for a single table row, constructed using an annotated java data object. Each entity is persisted into its own table.
DAO (Data Access Object) defines the method that access the database, using annotation to bind SQL to each method.
Database is a holder class that uses annotation to define the list of entities and database version. This class content defines the list of DAOs.


#Push commands to commit changes to repository.


git remote add origin https://github.com/saivaishnavianantapalli/RoomDatabase.git
git push -u origin master
