package org.br.mineradora.message;

import org.br.mineradora.dto.QuotationDTO;
import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class KafkaEvents {

    private final Logger LOG = LoggerFactory.getLogger(KafkaEvents.class);

    @Channel("quotation-channel") //estamos criando um canal que terá acesso a um
    // tópico do kafka
    Emitter<QuotationDTO> quotationRequestEmitter; //criamos um emissor que enviará
    // mensagens para dentro do kafka.  Note que está tipado com o tipo (QuotationDTO)
    // que será enviado.

    public void sendNewKafkaEvent(QuotationDTO quotation) {
        LOG.info("-- Enviando Cotação para Tópico Kafka --");
        quotationRequestEmitter.send(quotation).toCompletableFuture().join();
        //toCompletableFuture é usado para que não "esperemos" indefinidamente por um
        // retorno do envio desta mensagem.
    }
}
