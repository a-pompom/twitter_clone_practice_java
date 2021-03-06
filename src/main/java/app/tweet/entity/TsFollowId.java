package app.tweet.entity;
// Generated 2019/02/17 14:30:56 by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * TsFollowId generated by hbm2java
 */
@Embeddable
public class TsFollowId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int followUserId;
	private int followerUserId;

	public TsFollowId() {
	}

	public TsFollowId(int followUserId, int followerUserId) {
		this.followUserId = followUserId;
		this.followerUserId = followerUserId;
	}

	@Column(name = "follow_user_id", nullable = false)
	public int getFollowUserId() {
		return this.followUserId;
	}

	public void setFollowUserId(int followUserId) {
		this.followUserId = followUserId;
	}

	@Column(name = "follower_user_id", nullable = false)
	public int getFollowerUserId() {
		return this.followerUserId;
	}

	public void setFollowerUserId(int followerUserId) {
		this.followerUserId = followerUserId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TsFollowId))
			return false;
		TsFollowId castOther = (TsFollowId) other;

		return (this.getFollowUserId() == castOther.getFollowUserId())
				&& (this.getFollowerUserId() == castOther.getFollowerUserId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getFollowUserId();
		result = 37 * result + this.getFollowerUserId();
		return result;
	}

}
