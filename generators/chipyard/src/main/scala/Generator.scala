package chipyard

import freechips.rocketchip.util.GeneratorApp

object Generator extends GeneratorApp {
  override lazy val longName = names.topModuleClass + "." + names.configClassName
  generateFirrtl
  generateAnno
}
