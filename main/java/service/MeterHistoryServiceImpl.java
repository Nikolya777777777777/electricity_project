package service;

import dao.MeterHistoryDao;
import dao.MeterHistoryDaoImpl;
import model.Meter;
import org.hibernate.SessionFactory;
import util.HibernateUtil;
import java.util.List;

public class MeterHistoryServiceImpl implements MeterHistoryService {
    private static final SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    private static final MeterHistoryDao meterHistoryDao = new MeterHistoryDaoImpl(sessionFactory);
    @Override
    public Meter create(Meter entity) {
        return meterHistoryDao.create(entity);
    }

    @Override
    public Meter get(Long id) {
        return meterHistoryDao.get(id);
    }

    @Override
    public List<Meter> getAll() {
        return meterHistoryDao.getAll();
    }

    @Override
    public void remove(Meter entity) {
        meterHistoryDao.remove(entity);
    }
}
