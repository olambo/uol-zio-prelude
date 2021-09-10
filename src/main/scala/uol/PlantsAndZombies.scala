package uol

import uol.TopicVotes.*
import uol.TopicVotes.given
import zio.prelude.AssociativeOps
import zio.prelude.Newtype

object PlantsAndZombies:
  object TopicZ extends Newtype[String]
  type TopicZ = TopicZ.Type

  def main(args: Array[String]) =
    val topicZ1= TopicZ("zombie1")
    val topicZ2 = TopicZ("zombie2")
    println(topicZ1 == topicZ2)

    val plantsAndZombies = pzVotes
    println(plantsAndZombies)

  def pzVotes =
    val zombie1 = Map(Topic("zombie") -> Votes(4))
    val zombie2 = Map(Topic("zombie") -> Votes(2))
    val plants1 = Map(Topic("plants") -> Votes(3))
    zombie1 <> zombie2 <> plants1
