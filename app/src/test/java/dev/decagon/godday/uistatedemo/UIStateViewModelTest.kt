package dev.decagon.godday.uistatedemo

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class UIStateViewModelTest {

    @get: Rule
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    @Test
    fun `get value of count when updateCount() is not invoked value should return zero`() {

        // Given a UIStateViewModel
        val viewModel = UIStateViewModel()

        // When updateCount() is not invoked

        // Then assert that the value of count is zero
        assertTrue(viewModel.count.value == 0)
    }

    @Test
    fun `get value of count when updateCount() is invoked once value should return one`() {

        // Given a UIStateViewModel
        val viewModel = UIStateViewModel()

        // When updateCount() is invoked
        viewModel.updateCount()

        // Then assert that the value of count is one
        assertEquals(1, viewModel.count.value)
    }

    @Test
    fun `get value of count when updateCount() is invoked thrice value should return three`() {

        // Given a UIStateViewModel
        val viewModel = UIStateViewModel()

        // When updateCount() is invoked thrice
        viewModel.updateCount()
        viewModel.updateCount()
        viewModel.updateCount()

        // Then assert that the value of count is three
        assertEquals(3, viewModel.count.value)
    }
}