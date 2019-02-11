package app.tweet.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.tweet.entity.TmUser;

@Component
public class TmUserDao {
	
	@Autowired
	EntityManager em;
	
	public List<TmUser> findUserList() {
		String query = "select * from tm_user";
		return em.createNativeQuery(query, TmUser.class).getResultList();
	}
	
	/**
	 * ユーザ名をキーにユーザを取得する。
	 * @param userName フォームへ入力されたユーザ名
	 * @return ユーザエンティティ
	 */
	public TmUser findByUserName(String userName) {
		String query = "select * from tm_user where user_name = '" + userName + "'";
		return (TmUser)em.createNativeQuery(query, TmUser.class).getSingleResult();
	}
	
	
	public void saveOrUpdate(TmUser user) {
		em.merge(user);
	}

}