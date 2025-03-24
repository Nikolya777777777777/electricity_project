package service;

import dao.MeterDao;
import dao.MeterDaoImpl;
import dao.MeterHistoryDao;
import dao.MeterHistoryDaoImpl;
import model.Meter;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

public class MeterServiceImpl implements MeterService {
    private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static final MeterDao meterDao = new MeterDaoImpl(sessionFactory);
    @Override
    public Meter create(Meter entity) {
        return meterDao.create(entity);
    }

    @Override
    public Meter get(Long id) {
        return meterDao.get(id);
    }

    @Override
    public void remove(Meter entity) {
        meterDao.remove(entity);
    }
}
