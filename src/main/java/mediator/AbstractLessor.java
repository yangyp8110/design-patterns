package mediator;

/**
 * Created by mr.yang on 2018/10/20.
 */
public abstract class AbstractLessor {
    protected Mediator mediator;

    public AbstractLessor(Mediator mediator){
        this.mediator = mediator;
    }
}
