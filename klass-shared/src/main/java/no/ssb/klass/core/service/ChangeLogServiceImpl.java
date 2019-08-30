package no.ssb.klass.core.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import no.ssb.klass.core.model.Changelog;
import no.ssb.klass.core.repository.ChangelogRepository;

/**
 * @author Mads Lundemo, SSB.
 */
@Service
@Transactional
public class ChangeLogServiceImpl implements ChangeLogService {

    private final ChangelogRepository changelogRepository;

    public ChangeLogServiceImpl(ChangelogRepository changelogRepository) {
        this.changelogRepository = changelogRepository;
    }

    @Override
    public void deleteChangelog(Changelog changelog) {
        changelogRepository.delete(changelog);
    }

}
