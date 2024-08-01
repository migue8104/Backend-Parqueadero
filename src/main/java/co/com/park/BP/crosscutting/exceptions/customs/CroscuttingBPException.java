package co.com.park.BP.crosscutting.exceptions.customs;

import co.com.park.BP.crosscutting.exceptions.BPException;
import co.com.park.BP.crosscutting.exceptions.enums.Lugar;

public final class CroscuttingBPException extends BPException{
	
	private static final long serialVersionUID = 2325104002394078932L;

	public CroscuttingBPException(final String mensajeUsuario) {
		super(mensajeUsuario, Lugar.CROSCUTTING);
	}
	
	public CroscuttingBPException(final String mensajeTecnico, final String mensajeUsuario) {
		super(mensajeTecnico, mensajeUsuario, Lugar.CROSCUTTING);
	}
	
	public CroscuttingBPException(final String mensajeTecnico, final String mensajeUsuario, final Throwable exeptionRaiz) {
		super(mensajeTecnico, mensajeUsuario, Lugar.CROSCUTTING, exeptionRaiz);
	}

}
