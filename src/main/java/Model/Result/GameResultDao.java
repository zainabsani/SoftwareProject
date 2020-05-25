package Model.Result;

import jpa.GenericJpaDao;

import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * DAO class for the {@link } entity.
 */
public class GameResultDao extends GenericJpaDao<TicTacGameResult> {

    /**
     * An instance of GameResultDao.
     */
    private static GameResultDao instance;

    private GameResultDao() {
        super(TicTacGameResult.class);
    }

    public static GameResultDao getInstance() {
        if (instance == null) {
            instance = new GameResultDao();
            instance.setEntityManager(Persistence.createEntityManagerFactory("ChessApp-mysql").createEntityManager());
        }
        return instance;
    }

    /**
     * Returns the list of {@code n} best results with respect to the time
     * spent for solving the puzzle.
     *
     * @param n the maximum number of results to be returned
     * @return the list of {@code n} best results with respect to the time
     * spent for solving the puzzle
     */
    public List<TicTacGameResult> findBest(int n) {
        return entityManager.createQuery("SELECT r FROM ChessAppGameResult r ORDER BY r.score DESC", TicTacGameResult.class)
                .setMaxResults(n)
                .getResultList();
    }


    /**
     * Delete all rows from the specified entity instance in the database.
     */
    public void deleteAll() {
        entityManager.getTransaction().begin();
        Query query = entityManager.createQuery("DELETE FROM ChessAppGameResult");
        query.executeUpdate();
        entityManager.getTransaction().commit();
    }
}