package jkzhou.onboarding.api;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by @author J.K. Zhou
 * Date: 2019-08-25
 */
@Entity
public class EmailAddress
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private UUID userId;

    @Column(unique = true)
    private String address;

    public EmailAddress()
    {
    }

    public EmailAddress(UUID userId, String address)
    {
        this.userId = userId;
        this.address = address;
    }

    public String getAddress()
    {
        return address;
    }

    public UUID getId()
    {
        return id;
    }

    public UUID getUserId()
    {
        return userId;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setId(UUID id)
    {
        this.id = id;
    }

    public void setUserId(UUID userId)
    {
        this.userId = userId;
    }

    @Override
    public String toString()
    {
        return "EmailAddress [id=" + id + ", userId=" + userId + ", address=" + address + "]";
    }
}
