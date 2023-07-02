package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

import java.math.BigDecimal;
import java.util.Date;

@Jacksonized //para permitir que a classe seja lida como um objeto json.
@Data
@Builder
@AllArgsConstructor
public class QuotationDTO {

    //apenas estes dois campos serão enviados para o microserviço de relatórios.
    private Date date;
    private BigDecimal currencyPrice;
}
