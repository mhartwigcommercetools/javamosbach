package com.education.mosbach.banking;

import java.util.List;

public interface AccountDetailsFetcher {
    List<Account> fetchMyAccounts(int customerID) throws NoAccountsExistException;
}
