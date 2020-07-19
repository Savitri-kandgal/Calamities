package com.xworkz.naturalCalamities.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.naturalCalamities.entity.CalamitiesEntity;

@Component
public class CalamitiesDAOImpl implements CalamitiesDAO {

	@Autowired
	private SessionFactory factory;
	
	
	public CalamitiesDAOImpl() {
		System.out.println("Created :"+this.getClass().getSimpleName());

	}
	
	@Override
	public void create(CalamitiesEntity entity) {
		
			System.out.println("invoking create()");
			 	Session session=this.factory.openSession();

			 try {
				 session.beginTransaction();
				 System.out.println("transaction began");
				 System.out.println("saving entity");
				 session.save(entity);
				 session.getTransaction().commit();
				 System.out.println("entity saved in db");
			 }catch (Exception e) {
				e.printStackTrace();
				System.out.println("Failed to save entity into DB");
				session.getTransaction().rollback();
			}finally {
				session.close();
			}
			
			
		}

		
		
	}
