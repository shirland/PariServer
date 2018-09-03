package io.aggression.pari.interfaces;

import org.json.JSONObject;

public interface UserDao {
    public void createUser(JSONObject json) throws Exception;

}
