package com.example.demo.dtos;

public class HelloWorldDTO {


        private final long id;
        private final String content;

        public HelloWorldDTO(long id, String content) {
            this.id = id;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public String getContent() {
            return content;
        }

}
