package app.tweet.entity;
// Generated 2019/02/10 10:45:15 by Hibernate Tools 4.3.5.Final

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
 * TsShare generated by hbm2java
 */
@Entity
@Table(name = "ts_share", schema = "public")
public class TsShare implements java.io.Serializable {

	private TsShareId id;
	private Date shareTs;

	public TsShare() {
	}

	public TsShare(TsShareId id) {
		this.id = id;
	}

	public TsShare(TsShareId id, Date shareTs) {
		this.id = id;
		this.shareTs = shareTs;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "shareUserId", column = @Column(name = "share_user_id", nullable = false)),
			@AttributeOverride(name = "sharePostId", column = @Column(name = "share_post_id", nullable = false)) })
	public TsShareId getId() {
		return this.id;
	}

	public void setId(TsShareId id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "share_ts", length = 29)
	public Date getShareTs() {
		return this.shareTs;
	}

	public void setShareTs(Date shareTs) {
		this.shareTs = shareTs;
	}

}