package com.yf.es;

/**
 * @PROJECT_NAME: es-springdata
 * @DESCRIPTION:
 * @USER:
 * @DATE: 2021/8/12 下午5:39
 */

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductDao extends ElasticsearchRepository<Product,Long> {
}

