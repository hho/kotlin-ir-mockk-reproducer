package com.github.hho.kotlinirmockkreproducer

import io.mockk.every
import io.mockk.mockk
import org.junit.Test

class NewIrTest {
	private var foo: Foo<Bar> = mockk()
	private val someObject = Bar(1000L)

	@Test
	internal fun `This fails with new IR, but works with the old`() {
		every { foo.someMethod(any()) } returns someObject
	}
}

class Foo<T: Any> {
	private val someField = true

	fun someMethod(someParameter: T): T {

		fun `This inner method somehow triggers the bug, even if it's not used`() = someField

		return someParameter
	}
}

data class Bar(val someLong: Long)
