import java.util.Date;

public abstract class OperazioneFinanziaria {
	protected String id;
	protected double importo;
	protected Date date;
	protected String cliente;
	
	protected abstract void esegui();
	protected abstract String generaRiepilogo();
}
