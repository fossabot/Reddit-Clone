package io.github.anantharajuc.rc.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Data
@Entity
@Table(name="refresh_token") 
@EntityListeners(AuditingEntityListener.class)
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@FieldDefaults(level=AccessLevel.PRIVATE)
public class RefreshToken extends AuditEntity
{
	private static final long serialVersionUID = 1L;
	
	@Column(name="token")
	String token;
}
