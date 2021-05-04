package com.education.mosbach.banking;

public class CloudDBBankingManagerImpl implements BankingManager {

    private static CloudDBBankingManagerImpl cloudDBBankingManager =
            new CloudDBBankingManagerImpl();

    private CloudDBBankingManagerImpl() {
    }

    public static CloudDBBankingManagerImpl getCloudDBBankingManagerImpl() {
        return cloudDBBankingManager;
    }

    @Override
    public void backupData() {
        System.out.println(">>>>>> I am backing up all data somewhere in the cloud.");
    }
}
