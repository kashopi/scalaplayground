/*
Scala enables the reachability detection only on vals and vars,
never on constants.
A constant is considered when the first letter is uppercase.
*/

import math.{E, Pi}

E match {
	case Pi => "Oops, there is an error"
	case _ => "Earth still spinning, OK"
}

/* No warning here, everything is ok */

val pi = math.Pi

E match {
	case pi => "Oops, there is an error"
	case _ => "Earth still spinning, OK"
}

// Here we get an error of "unreachable code"

