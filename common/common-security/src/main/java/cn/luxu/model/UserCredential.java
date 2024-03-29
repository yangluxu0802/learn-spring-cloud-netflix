package cn.luxu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户账号类型
 * 
 *
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserCredential implements Serializable {

	private static final long serialVersionUID = -958701617717204974L;

	private String username;
	private String type;
	private Long userId;

}
