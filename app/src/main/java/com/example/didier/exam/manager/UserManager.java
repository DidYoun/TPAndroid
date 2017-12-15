package com.example.didier.exam.manager;

import com.example.didier.exam.entity.User;

public class UserManager {

    /**
     * Instantiate new user, check validation and try to save it in database
     *
     * @param lastname String
     * @param firstname String
     * @param email String
     * @return bool
     */
    public boolean register(String lastname, String firstname, String email)
    {
        User user = new User(lastname, firstname, email, "01/02/1995");

        if (!beforeSave(user)) {
            return false;
        }
        // Validation on UserManager entity before persist

        return save(user);
    }

    /**
     * Validations
     *
     * @param user User
     * @return bool
     */
    private boolean beforeSave(User user)
    {
        return true;
    }

    /**
     * Persist UserManager in database
     *
     * @param user User
     * @return bool
     */
    private boolean save(User user)
    {
        return true;
    }
}
