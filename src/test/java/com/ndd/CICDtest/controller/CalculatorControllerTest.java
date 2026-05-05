package com.ndd.CICDtest.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorControllerTest {

    CalculatorController controller = new CalculatorController();

    // ✅ 성공 케이스
//    @Test
//    void divide_success() {
//        int result = controller.divide(10, 2);
//        assertEquals(5, result);
//    }

//     ❌ 실패 케이스 (일부러 틀리게)
    @Test
    void divide_fail() {
        int result = controller.divide(10, 2);
        assertEquals(3, result); // 일부러 틀림 → CI 실패
    }
}