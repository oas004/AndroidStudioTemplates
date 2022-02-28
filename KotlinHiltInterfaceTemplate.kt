#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject

interface ${NAME} {
}

class ${NAME}Impl @Inject constructor(): ${NAME} {
}

@Module
@InstallIn(SingletonComponent::class)
interface ${NAME}Module {
    @Binds
    fun bind${NAME}(impl: ${NAME}Impl): ${NAME} 
}
