package co.com.park.BP.crosscutting.exceptions;

import co.com.park.BP.crosscutting.exceptions.enums.Lugar;
import co.com.park.BP.crosscutting.helpers.ObjectHelper;
import co.com.park.BP.crosscutting.helpers.TextHelper;

public class BPException extends RuntimeException {

	private static final long serialVersionUID = 4029244336874739730L;
	protected String mensajeUsuario;
	protected Lugar lugar;

	public BPException(final String mensajeTecnico, final String mensajeUsuario, final Lugar lugar,
			final Throwable exeptionRaiz) {
		super(mensajeTecnico, exeptionRaiz);
		setMensajeUsuario(mensajeUsuario);
		setLugar(lugar);
	}

	public BPException(final String mensajeUsuario, final Lugar lugar) {
		super(mensajeUsuario);
		setMensajeUsuario(mensajeUsuario);
		setLugar(lugar);
	}

	public BPException(final String mensajeTecnico, final String mensajeUsuario, final Lugar lugar) {
		super(mensajeTecnico);
		setMensajeUsuario(mensajeUsuario);
		setLugar(lugar);
	}

	private final void setMensajeUsuario(final String mensajeUsuario) {
		this.mensajeUsuario = TextHelper.applyTrim(mensajeUsuario);
	}

	private final void setLugar(final Lugar lugar) {
		this.lugar = ObjectHelper.getObjectHelper().getDefaultValue(lugar, Lugar.DEFAULT);
	}

	public final String getMensajeUsuario() {
		return mensajeUsuario;
	}

	public final Lugar getLugar() {
		return lugar;
	}

}
