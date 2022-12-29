
package com.test;
import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class Main {	
	public static void main(String[]args)
	{
		// step-1
				System.out.println("line 1");
				Configuration configuration = new Configuration(); // creating configuration object
				System.out.println("line 2");
				configuration.configure("hibernate.cfg.xml"); // this method is used to load cfg file
				// step-2
				System.out.println("line 3");
				SessionFactory sessionFactory = configuration.buildSessionFactory();
				System.out.println("line 4");
				// step-3
				Session session = sessionFactory.openSession();
				System.out.println("line 5");

				// step-4
				Transaction transaction = session.beginTransaction();
				System.out.println("line 6");

				//First first=(First)session.get(First.class, 1);//UPDATE THE DATA
				First first=new First();
				first.setFirstName("bhagya");
				first.setLastName("waghmode");
				first.setAddress("kolhapur");
				first.setMobileno("23456");
				session.save(first);
	           transaction.commit();//unless we cant insert the record inta db
	           
				session.close();
				System.out.println("Record saved successfully...");
			}


	}



