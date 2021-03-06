package arida.ufc.br.moap.datamodelapi.spi;

import arida.ufc.br.moap.core.algorithm.spi.ITrajectoryFactory;
import arida.ufc.br.moap.core.beans.MovingObject;
import arida.ufc.br.moap.core.beans.Trajectory;
import arida.ufc.br.moap.core.beans.TrajectoryFactoryImp;
import arida.ufc.br.moap.core.beans.iterators.api.IMovingObjectIterable;
import arida.ufc.br.moap.core.spi.IAnnotable;
import arida.ufc.br.moap.core.spi.IDataModel;
import arida.ufc.br.moap.core.beans.iterators.api.ITrajectoryIterable;
import arida.ufc.br.moap.core.beans.iterators.api.ITrajectoryIterator;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 *
 * @author franzejr
 * @author rafaelelias
 */
public interface ITrajectoryModel<S,T> extends IDataModel {
    
    /*
     * Add a single trajectory
     */
    
    public void addTrajectory(Trajectory<S,T> trajectory);
    /*
     * @return Trajectory
     */
    public Trajectory<S,T> getTrajectory(int id);
    
    public Trajectory<S,T> getTrajectory(String id);
    
    public Trajectory<S,T> removeTrajectory(int id);
    
    public Trajectory<S,T> removeTrajectory(String id);
    
    public ITrajectoryFactory<S,T> factory();
    
    /*
     * @return List of All trajectories for a Moving Object
     */
    public Collection<Trajectory<S,T>> getTrajectories(MovingObject mo);
    
    /*
     * @return Collection of all trajectory for a given Moving Object
     */
    public Collection<Trajectory<S,T>> getTrajectories(String mo);
    
    /*
     * @return List of All trajectories
     */
    public ITrajectoryIterable getTrajectories();
    
    public IMovingObjectIterable getMovingObjects();

    /*
     * @return Moving Object
     */
    public MovingObject getMovingObject(int idx);
    
    public MovingObject getMovingObject(String id);
    
    /*
     * @return Moving Object 
     */
    public MovingObject removeMovingObject(int idx);
    
    public MovingObject removeMovingObject(String id);
    /*
     * @return Trajectory count
     */
    public int getTrajectoryCount();
    /*
     * @return Moving Object count
     */
    public int getMovingObjectCount();
    
//    public void readLock() ;
//
//    public void readUnLock() ;
//
//    public void readUnlockAll() ;
//
//    public void writeLock() ;
//
//    public void writeUnlock();
    
    
}
