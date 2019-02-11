package app.tweet.entity;
// Generated 2019/02/11 17:54:56 by Hibernate Tools 4.3.5.Final

import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * TsFavorite generated by hbm2java
 */
@Entity
@Table(name = "ts_favorite")
public class TsFavorite implements java.io.Serializable {

	private TsFavoriteId id;
	private Date favoriteTs;

	public TsFavorite() {
	}

	public TsFavorite(TsFavoriteId id) {
		this.id = id;
	}

	public TsFavorite(TsFavoriteId id, Date favoriteTs) {
		this.id = id;
		this.favoriteTs = favoriteTs;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "favoriteUserId", column = @Column(name = "favorite_user_id", nullable = false)),
			@AttributeOverride(name = "favoritePostId", column = @Column(name = "favorite_post_id", nullable = false)) })
	public TsFavoriteId getId() {
		return this.id;
	}

	public void setId(TsFavoriteId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "favorite_ts", length = 29)
	public Date getFavoriteTs() {
		return this.favoriteTs;
	}

	public void setFavoriteTs(Date favoriteTs) {
		this.favoriteTs = favoriteTs;
	}

}
