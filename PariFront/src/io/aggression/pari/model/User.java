package io.aggression.pari.model;

import java.util.List;

class User {

    private String userName;
    private String userId;
    private String emailAddress;
    private String phoneNumber;
    private List<Account> heldAccounts;

    private enum Type {
        ADMIN, STANDARD, MARKET_MAKER;
    }

}
