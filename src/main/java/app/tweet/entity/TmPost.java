package app.tweet.entity;
// Generated 2019/02/17 14:30:56 by Hibernate Tools 4.3.5.Final

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import app.tweet.base.BaseEntity;

/**
 * TmPost generated by hbm2java
 */
@Entity
@Table(name = "tm_post")
public class TmPost extends BaseEntity implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int postId;
	private String post;
	private Integer postUserId;
	private Date postTs;
	private Boolean deleteFlg;

	public TmPost() {
	}

	public TmPost(int postId, String post) {
		this.postId = postId;
		this.post = post;
	}

	public TmPost(int postId, String post, Integer postUserId, Date postTs, Boolean deleteFlg) {
		this.postId = postId;
		this.post = post;
		this.postUserId = postUserId;
		this.postTs = postTs;
		this.deleteFlg = deleteFlg;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "post_id", unique = true, nullable = false)
	public int getPostId() {
		return this.postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	@Column(name = "post", nullable = false)
	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	@Column(name = "post_user_id")
	public Integer getPostUserId() {
		return this.postUserId;
	}

	public void setPostUserId(Integer postUserId) {
		this.postUserId = postUserId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@CreationTimestamp
	@Column(name = "post_ts", length = 29)
	public Date getPostTs() {
		return this.postTs;
	}

	public void setPostTs(Date postTs) {
		this.postTs = postTs;
	}

	@Column(name = "delete_flg")
	public Boolean getDeleteFlg() {
		return this.deleteFlg;
	}

	public void setDeleteFlg(Boolean deleteFlg) {
		this.deleteFlg = deleteFlg;
	}
	
	/**
	 * 永続化前に呼ばれるメソッド
	 * デフォルト値を設定する
	 */
	@PrePersist
	public void prePersist()
	{
		//削除フラグが未設定の場合falseをセット
	    if ( getDeleteFlg() == null )
	    {
	        setDeleteFlg(false);
	    }
	}

}
