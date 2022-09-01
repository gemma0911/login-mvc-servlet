package model.dao;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;


public class connection {

           private static String hostName = "localhost"; //127.0.0.1

            private static String password = "123123";

            private static String usename = "sa";

            private static String database = "hehe";
            /**
             *
             * get connection to database
             *
             * @return Connection to database if connect success
             * @throws ClassNotFoundException
             * @throws SQLException
             */
            public Connection getDatabaseConnection() {
                    Connection conn = null;
                try {
                                Class.forName("net.sourceforge.jtds.jdbc.Driver");
                                String connectionURL = "jdbc:jtds:sqlserver://" + hostName + ":53319/" + database + ";CharacterSet=UTF-8";
                                conn = DriverManager.getConnection(connectionURL, usename, password);
                                System.out.println("Connected!");
                } catch (ClassNotFoundException e) {
                              e.printStackTrace();
                        } catch (SQLException e) {
                                e.printStackTrace();
                        }
                return conn;
            }
        public static void main(String[] args) {
                connection abc = new connection();
                abc.getDatabaseConnection();
        }
}