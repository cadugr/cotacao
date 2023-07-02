package org.br.mineradora.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.extern.jackson.Jacksonized;

@Jacksonized //para permitir que a classe seja lida como um objeto json.
@Data
@Builder
@AllArgsConstructor
public class CurrencyPriceDTO {

    private USDBRL USDBRL;
}
