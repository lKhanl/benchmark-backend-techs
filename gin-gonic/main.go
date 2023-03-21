package main

import (
	"github.com/gin-gonic/gin"
	"github.com/joho/godotenv"
	"log"
	"time"
)

func init() {

	err := godotenv.Load()
	if err != nil {
		log.Fatal("Error loading .env file")
	}

}

func main() {

	r := gin.Default()
	r.GET("/", func(c *gin.Context) {

		start := time.Now()

		result := 1
		for i := 1; i < 1_000; i++ {
			result = i + result
		}

		elapsed := time.Since(start)

		c.JSON(200, gin.H{
			"result": result,
			"tech":   "gin-gonic",
			"time":   elapsed,
		})
	})
	r.Run()

}
