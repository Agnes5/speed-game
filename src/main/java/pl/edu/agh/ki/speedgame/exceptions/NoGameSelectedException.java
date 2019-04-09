package pl.edu.agh.ki.speedgame.exceptions;

public class NoGameSelectedException extends InFunException {
    public NoGameSelectedException() {
        super();
    }

    public NoGameSelectedException(String message) {
        super(message);
    }

    public NoGameSelectedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoGameSelectedException(Throwable cause) {
        super(cause);
    }
}
