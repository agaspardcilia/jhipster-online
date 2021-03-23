/**
 * Copyright 2017-2021 the original author or authors from the JHipster project.
 *
 * This file is part of the JHipster Online project, see https://github.com/jhipster/jhipster-online
 * for more information.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jhipster.online.repository;

import io.github.jhipster.online.domain.JdlMetadata;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the JdlMetadata entity.
 */
@SuppressWarnings("unused")
@Repository
public interface JdlMetadataRepository extends JpaRepository<JdlMetadata, String> {
    List<JdlMetadata> findAllByUserLogin(String userLogin, Sort sort);

    List<JdlMetadata> findAllByUserLogin(String userLogin);

    void deleteAllByUserLogin(String userLogin);
}
