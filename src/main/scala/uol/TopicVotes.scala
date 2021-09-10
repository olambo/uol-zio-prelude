package uol

import zio.prelude.*

object TopicVotes:

  case class Topic(value: String)

  case class Votes(value: Int)

  given Associative[Votes] with
    def combine(left: => Votes, right: => Votes): Votes = Votes(left.value + right.value)
