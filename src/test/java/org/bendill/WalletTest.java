package org.bendill;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WalletTest {
    @Test
    public void shouldGetValueFromWallet(){
        Wallet wallet = new Wallet();
        assertEquals(0, wallet.getTotal());
    }

    @Test
    public void shouldAddBillToWallet(){
        Wallet wallet = new Wallet();
        wallet.addBill(Bill.ONE);
        assertEquals(1, wallet.countBills());
    }
}
