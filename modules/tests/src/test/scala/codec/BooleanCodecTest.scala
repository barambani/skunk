// Copyright (c) 2018-2020 by Rob Norris
// This software is licensed under the MIT License (MIT).
// For more information see LICENSE or https://opensource.org/licenses/MIT

package tests
package codec

import cats.implicits._
import skunk.codec.all._

case object BooleanCodecTest extends CodecTest {
  roundtripTest(bool)(true, false)
  decodeFailureTest(bool, List("xx"))
}


