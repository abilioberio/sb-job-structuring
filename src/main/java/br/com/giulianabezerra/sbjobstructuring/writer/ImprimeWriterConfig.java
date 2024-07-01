package br.com.giulianabezerra.sbjobstructuring.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImprimeWriterConfig {

  @Bean
  public ItemWriter<Integer> imprimeWriter() {
    return System.out::println;
  }
}
