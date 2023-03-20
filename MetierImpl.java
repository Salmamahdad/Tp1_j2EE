package metier;

import Dao.dao.IDao;

public class MetierImpl implements Imetier {
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return 0;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
