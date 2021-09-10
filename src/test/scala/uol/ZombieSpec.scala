package uol

import zio.{Chunk, ZIO}
import zio.test.*
import zio.test.Assertion.*
import PlantsAndZombies.*
import uol.TopicVotes.{Topic, Votes}

object ZombieSpec extends DefaultRunnableSpec:

  override def spec = suite("one") {
    test("t1") {
      val zombieVotes = PlantsAndZombies.pzVotes.filter(_._1.value == "zombie")
      assertTrue(zombieVotes == Map(Topic("zombie") -> Votes(6)))
    }
  }
